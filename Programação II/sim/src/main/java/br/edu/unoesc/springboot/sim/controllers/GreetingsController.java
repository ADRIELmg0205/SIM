package br.edu.unoesc.springboot.sim.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.springboot.sim.model.cliente;
import br.edu.unoesc.springboot.sim.model.produto;
import br.edu.unoesc.springboot.sim.model.setor;
import br.edu.unoesc.springboot.sim.repository.ClienteRepository;
import br.edu.unoesc.springboot.sim.repository.ProdutoRepository;
import br.edu.unoesc.springboot.sim.repository.SetorRepository;

import br.edu.unoesc.springboot.sim.model.setor;
import br.edu.unoesc.springboot.sim.repository.SetorRepository;

/**
* 
* @author Adriel/Gustavo
* @version 1.0
* 
*/

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public String greetingText(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }
    

    @Autowired // injeção de dependência
	private SetorRepository setorRepository;
	
	@RequestMapping(value = "GravarSetor/{nomesetor}", method = RequestMethod.GET)
    	@ResponseStatus(HttpStatus.OK)
   	 public String testeGravar(@PathVariable String nomesetor){
    		setor setor = new setor();
			setor.setNomesetor(nomesetor);
    		setorRepository.save(setor);
    		return "Gravado";    	
    	}
	
	@GetMapping(value="ListaSetor")	
	   @ResponseBody
	    public ResponseEntity<List<setor>>listaSetor(){
	    	List<setor> setores = setorRepository.findAll();
	    	return new ResponseEntity<List<setor>>(setores, HttpStatus.OK) ;
	    }
		
	@Autowired // injeção de dependência
	private ClienteRepository clienteRepository;
//	
//	@RequestMapping(value = "GravarCliente/{nomecliente}", method = RequestMethod.GET)
//	@ResponseStatus(HttpStatus.OK)
//	 public String testeGravarCliente(@PathVariable String nomecliente){
//		cliente cliente = new cliente();
//		cliente.setNomecliente(nomecliente);
//		clienteRepository.save(cliente);
//		return "Gravado";    	
//	}
	
	@PostMapping(value = "salvarcliente")
    @ResponseBody
    public ResponseEntity<cliente> salvarcliente(@RequestBody cliente cliente){
    	cliente client = clienteRepository.save(cliente);
    	return new ResponseEntity<cliente>(client, HttpStatus.CREATED);
    }
    
    @DeleteMapping(value = "deletecliente")
	@ResponseBody
	public ResponseEntity<String> deletecliente(@RequestParam Long idclient) {
		clienteRepository.deleteById(idclient);
		return new ResponseEntity<String>("Cliente excluido com sucesso", HttpStatus.OK);
	}

    @GetMapping(value = "buscaruseridcliente")
	@ResponseBody
	public ResponseEntity<cliente> buscaruseridcliente(@RequestParam(name = "codigocliente") Long codigocliente){
		cliente cliente = clienteRepository.findById(codigocliente).get();
		return new ResponseEntity<cliente>(cliente, HttpStatus.OK);
	}

	@PutMapping(value = "atualizarcliente")
	@ResponseBody
	public ResponseEntity<?> atualizarcliente(@RequestBody cliente cliente){
		if(cliente.getCodigocliente()==null) {
			return new ResponseEntity<String>("Id não informado para atualizar", HttpStatus.OK);
		}
		cliente client = clienteRepository.saveAndFlush(cliente);
		return new ResponseEntity<cliente>(client, HttpStatus.OK);
	}

	@GetMapping(value = "buscarpornomecliente")
	@ResponseBody
	public ResponseEntity<List<cliente>>bucarPorNomeCliente(@RequestParam(name = "nome") String nome){
		List<cliente> client = clienteRepository.buscarPorNomeCliente(nome.trim().toUpperCase());
		return new ResponseEntity<List<cliente>>(client, HttpStatus.OK);
	}
	
	
	//parte de produtos
	
	@Autowired // injeção de dependência
	private ProdutoRepository produtoRepository;
	
	@GetMapping(value = "buscarpornomeproduto")
	@ResponseBody
	public ResponseEntity<List<produto>>bucarPorNomeProduto(@RequestParam(name = "nome") String nome){
		List<produto> prod = produtoRepository.buscarPorNomeProduto(nome.trim().toUpperCase());
		return new ResponseEntity<List<produto>>(prod, HttpStatus.OK);
	}

	@PostMapping(value = "salvarproduto")
    @ResponseBody
    public ResponseEntity<produto> salvarproduto(@RequestBody produto produto){
    	produto produtos = produtoRepository.save(produto);
    	return new ResponseEntity<produto>(produto, HttpStatus.CREATED);
    }
    
    @DeleteMapping(value = "deleteproduto")
   	@ResponseBody
   	public ResponseEntity<String> deleteproduto(@RequestParam Long codigoproduto) {
   		produtoRepository.deleteById(codigoproduto);
   		return new ResponseEntity<String>("Produto excluido com sucesso", HttpStatus.OK);
   	}
    
    @GetMapping(value = "buscaruseridproduto")
   	@ResponseBody
   	public ResponseEntity<produto> buscaruseridproduto(@RequestParam(name = "codigoproduto") Long codigoproduto){
   		produto produtos = produtoRepository.findById(codigoproduto).get();
   		return new ResponseEntity<produto>(produtos, HttpStatus.OK);
   	}

}
