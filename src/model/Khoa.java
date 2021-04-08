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
public class Khoa {
    private String IDkhoa;
	private String Tenkhoa;

	public String getIDkhoa() {
		return IDkhoa;
	}

	public void setIDkhoa(String iDkhoa) {
		IDkhoa = iDkhoa;
	}

	public String getTenkhoa() {
		return Tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		Tenkhoa = tenkhoa;
	}

	public Khoa(String iDkhoa, String tenkhoa) {
		super();
		IDkhoa = iDkhoa;
		Tenkhoa = tenkhoa;
	}

	public Khoa() {
		super();
		// TODO Auto-generated constructor stub
	}
}
