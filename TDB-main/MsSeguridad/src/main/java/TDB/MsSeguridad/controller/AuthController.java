package TDB.MsSeguridad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB.MsSeguridad.model.UsuarioModel;
import TDB.MsSeguridad.services.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;


            @PostMapping("/crear")
    public ResponseEntity<UsuarioModel> crearUsuario(@RequestBody UsuarioModel user) {
    UsuarioModel newUser= authService.crearUsuario(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    
    @GetMapping
    public List<UsuarioModel> getAll() {
        return authService.getAll();
    }




}
