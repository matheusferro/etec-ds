package etec.lojaDoJorgin.lojaDoJorgin.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    String cadastroCliente(@RequestBody ClienteRequest clienteRequest){
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setNome(clienteRequest.getNome());
        clienteEntity.setTel(clienteRequest.getTel());
        clienteEntity.setEmail(clienteRequest.getEmail());
        clienteRepository.save(clienteEntity);
        return clienteRequest.getNome()+" Cadastrado!";
    }

}
