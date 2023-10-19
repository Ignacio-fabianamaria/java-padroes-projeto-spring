package dio.desafio.service;

import dio.desafio.model.Cliente;


/**
 * Esta interface define o padrão de design <b>Strategy</b> no domínio de clientes. 
 * Ela permite ter várias implementações alternativas dessa mesma interface, se necessário.
 * Ela define os métodos para operações relacionadas aos clientes
 * 
 * - `buscarTodos()`: Retorna uma lista de todos os clientes.
 * - `buscarPorId(Long id)`: Retorna um cliente com o ID especificado.
 * - `inserir(Cliente cliente)`: Insere um novo cliente no sistema.
 * - `atualizar(Long id, Cliente cliente)`: Atualiza as informações de um cliente existente com o ID fornecido.
 * - `deletar(Long id)`: Remove um cliente com o ID especificado.
 * 
 * Autor: Ignacio-fabiana maria
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}