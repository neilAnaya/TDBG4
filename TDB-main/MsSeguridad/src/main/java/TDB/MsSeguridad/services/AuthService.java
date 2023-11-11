package TDB.MsSeguridad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDB.MsSeguridad.model.UsuarioModel;
import TDB.MsSeguridad.repository.IAuthRepository;

@Service
public class AuthService {
    
    @Autowired
    IAuthRepository authRepository;

    public List<UsuarioModel> getAll() {
        return (List<UsuarioModel>) authRepository.findAll();
    }

    public UsuarioModel crearUsuario(UsuarioModel user){
        return authRepository.save(user);
    }

}
