package br.com.omelhoralek.todolist.user;

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
  public void create(@RequestBody UserModel UserModel) {
    System.out.println(UserModel.getUsername());
  }

}
