package dio.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio.model.Cliente;
import dio.desafio.service.ClienteService;

/**
 * Este {@link RestController} representa uma <b>Facade</b> que simplifica o acesso às operações
 * de integração com o Banco de Dados H2 e a API do ViaCEP. Ele oferece uma interface REST coesa
 * para acessar essas funcionalidades de forma transparente.
 * 
 * Autor: Ignacio-fabianamaria
 * 
 * - `buscarTodos()`: Recupera todos os clientes do sistema e retorna uma coleção de objetos {@link Cliente}.
 * - `buscarPorId(Long id)`: Recupera um cliente específico com base no ID fornecido e retorna o objeto {@link Cliente} correspondente.
 * - `inserir(Cliente cliente)`: Insere um novo cliente no sistema com base no objeto {@link Cliente} fornecido e retorna o cliente inserido.
 * - `atualizar(Long id, Cliente cliente)`: Atualiza as informações de um cliente existente com o ID fornecido, usando o objeto {@link Cliente} com as informações atualizadas. Retorna o cliente atualizado.
 * - `deletar(Long id)`: Remove um cliente com o ID fornecido do sistema. Retorna uma resposta indicando a conclusão da operação.
 */

@RestController
@RequestMapping("clientes")
public class ClienteRestController {
    @Autowired
	private ClienteService clienteService;
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos() {
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}
	@PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
		clienteService.inserir(cliente);
		return ResponseEntity.ok(cliente);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		clienteService.deletar(id);
		return ResponseEntity.ok().build();
	}
}
