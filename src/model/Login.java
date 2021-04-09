/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MYPCDESU
 */
public class Login {
    private String User;
	private String Id;
	private String Hello;
	public String getUser() {
		return User;
	}
	public String getId() {
		return Id;
	}
	public String getHello() {
		return Hello;
	}
	public Login(String user, String id, String hello) {
		super();
		User = user;
		Id = id;
		Hello = hello;
	}
}
