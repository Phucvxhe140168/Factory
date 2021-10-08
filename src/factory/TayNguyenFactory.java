/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Random;

/**
 *
 * @author Vu X Phuc
 */
public class TayNguyenFactory implements GiongCayTrongFactory {
    @Override
	public Giong chonGiong() {
		Random chonGiongNgauNhien = new Random();

		switch (chonGiongNgauNhien.nextInt(3)) {
		case 0:
			return new CaPhe();
		case 1:
			return new Tieu();
		case 2:
			return new CaoSu();
		default:
			return null;
		}
	}
}
