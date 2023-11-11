package TDB.MsSeguridad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB.MsSeguridad.model.UsuarioModel;
import TDB.MsSeguridad.services.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping
    public List<UsuarioModel> getAll() {
        return authService.getAll();
    }

        @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<UsuarioModel> deleteById(@PathVariable int id){
         authService.deleteById(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
