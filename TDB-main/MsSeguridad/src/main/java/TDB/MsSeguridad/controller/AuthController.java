package TDB.MsSeguridad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB.MsSeguridad.services.AuthService;

import TDB.MsSeguridad.model.UsuarioModel;

@RestController
@RequestMapping("/api/auth/")
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping("/getallusers")
    public List<UsuarioModel> getAll() {
        return authService.getAll();
    }
    @GetMapping("/finduserbyid/{id}")
    public Optional<UsuarioModel> getById(@PathVariable int id){
        return authService.getById(id);
    }
}
