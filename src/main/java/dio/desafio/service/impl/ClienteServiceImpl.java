package dio.desafio.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio.exception.ClienteNotFoundException;
import dio.desafio.model.Cliente;
import dio.desafio.model.ClienteRepository;
import dio.desafio.model.Endereco;
import dio.desafio.model.EnderecoRepository;
import dio.desafio.service.ClienteService;
import dio.desafio.service.ViaCepService;

/**
 * Esta classe é uma implementação da estratégia <b>Strategy</b>
 * {@link ClienteService} e pode ser
 * injetada pelo Spring (via {@link Autowired}). Sendo um {@link Service}, ela
 * opera como um
 * <b>Singleton</b>.
 * 
 * Ela implementa métodos definidos na interface {@link ClienteService} e atua
 * como um <b>Facade</b>,
 * abstraindo integrações com subsistemas, fornecendo uma interface simples.
 * 
 * Autor: Ignacio-fabianamaria
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
	  private ViaCepService viaCepService;

    private void salvarCliente(Cliente cliente){
      String cep = cliente.getEndereco().getCep();
      Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
        Endereco novoEndereco = viaCepService.consultarCep(cep);
        enderecoRepository.save(novoEndereco);
        return novoEndereco;
      });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (!cliente.isPresent()) {
            throw new ClienteNotFoundException("Cliente com o ID " + id + " não encontrado.");
        } else {
            return cliente.get();
        }
    }

    @Override
    public void inserir(Cliente cliente) {
      salvarCliente(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
      Optional<Cliente> clienteBD = clienteRepository.findById(id);
      if(clienteBD.isPresent()){
        salvarCliente(cliente);
      }
    }

    @Override
    public void deletar(Long id) {
      clienteRepository.deleteById(id);
        return;
    }

}
