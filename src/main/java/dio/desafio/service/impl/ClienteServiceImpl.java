package dio.desafio.service.impl;

import org.springframework.stereotype.Service;

import dio.desafio.model.Cliente;
import dio.desafio.service.ClienteService;


/**
 * Esta classe é uma implementação da estratégia <b>Strategy</b> {@link ClienteService} e pode ser
 * injetada pelo Spring (via {@link Autowired}). Sendo um {@link Service}, ela opera como um
 * <b>Singleton</b>.
 * 
 * Ela implementa métodos definidos na interface {@link ClienteService} e atua como um <b>Facade</b>,
 * abstraindo integrações com subsistemas, fornecendo uma interface simples.
 * 
 * Autor: Ignacio-fabianamaria
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    @Override
    public Iterable<Cliente> buscarTodos() {
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }
    @Override
    public Cliente buscarPorId(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }
    @Override
    public void inserir(Cliente cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }
    @Override
    public void atualizar(Long id, Cliente cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
    @Override
    public void deletar(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }
    
}
