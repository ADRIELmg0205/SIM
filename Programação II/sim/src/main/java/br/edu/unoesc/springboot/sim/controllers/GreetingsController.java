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
import br.edu.unoesc.springboot.sim.model.setor;
import br.edu.unoesc.springboot.sim.repository.ClienteRepository;
import br.edu.unoesc.springboot.sim.repository.SetorRepository;

import br.edu.unoesc.springboot.sim.model.setor;
import br.edu.unoesc.springboot.sim.repository.SetorRepository;

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
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    

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
	
	@PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<cliente> salvar(@RequestBody cliente cliente){
    	cliente client = clienteRepository.save(cliente);
    	return new ResponseEntity<cliente>(client, HttpStatus.CREATED);
    }
    
    @DeleteMapping(value = "delete")
	@ResponseBody
	public ResponseEntity<String> delete(@RequestParam Long idclient) {
		clienteRepository.deleteById(idclient);
		return new ResponseEntity<String>("Cliente excluido com sucesso", HttpStatus.OK);
	}

    @GetMapping(value = "buscaruserid")
	@ResponseBody
	public ResponseEntity<cliente> buscaruserid(@RequestParam(name = "idclient") Long idclient){
		cliente cliente = clienteRepository.findById(idclient).get();
		return new ResponseEntity<cliente>(cliente, HttpStatus.OK);
	}

	@PutMapping(value = "atualizar")
	@ResponseBody
	public ResponseEntity<?> atualizar(@RequestBody cliente cliente){
		if(cliente.getCodigocliente()==null) {
			return new ResponseEntity<String>("Id não informado para atualizar", HttpStatus.OK);
		}
		cliente client = clienteRepository.saveAndFlush(cliente);
		return new ResponseEntity<cliente>(client, HttpStatus.OK);
	}

//	@GetMapping(value = "buscarpornome")
//	@ResponseBody
//	public ResponseEntity<List<cliente>>bucarPorNome(@RequestParam(name = "nome") String nome){
//		List<cliente> cliente = clienteRepository.buscarPorNome(nome.trim().toUpperCase());
//		return new ResponseEntity<List<cliente>>(cliente, HttpStatus.OK);
//	}


}
