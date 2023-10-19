package dio.desafio.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.desafio.model.Endereco;

/**
 * Esta classe é um cliente HTTP criado com <b>OpenFeign</b> para consumir a API do <b>ViaCEP</b>.
 * 
 * Ele utiliza o <b>Spring Cloud OpenFeign</b> para simplificar a integração com a API de consulta de CEP.
 * 
 * Autor: Ignacio-fabianamaria
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}