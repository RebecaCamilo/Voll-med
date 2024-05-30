package med.voll.api.controller;

import lombok.AllArgsConstructor;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
@AllArgsConstructor
public class MedicoController {

    private MedicoRepository repository;

    @PostMapping
    public DadosCadastroMedico cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
        return dados;
    }
}
