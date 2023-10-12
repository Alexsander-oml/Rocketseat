package br.com.omelhoralek.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private IUserRepository userRepository;

  /*
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (double) números 0.0000
   * Float (float) números 0.0000
   * Char (A C )
   * Date (data)
   * void (sem retorno)
   */

  /*
   * body
   */
  @PostMapping("/")
  // public void create(@RequestBody UserModel UserModel) { //
  // System.out.println(UserModel.getUsername());
  
  public UserModel create(@RequestBody UserModel UserModel) {

    var user = this.userRepository.findByUsername(UserModel.getUsername());

    if(user != null){
        System.out.println("Usuário já existe");
        return null;
    }

    var userCreated = this.userRepository.save(UserModel);
    return userCreated;
  }

}
