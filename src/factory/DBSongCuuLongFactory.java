/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Vu X Phuc
 */
public class DBSongCuuLongFactory implements GiongCayTrongFactory {
    private int count = 0;
	
	@Override
	public Giong chonGiong() {
		switch (count) {
		case 0:
			count ++;
			return new Cam();
		case 1:
			count ++;
			return new Xoai();
		case 2:
			count ++;
			return new Nhan();
		case 3:
			count = 0;
			return new SauRieng();
		default:
			count = 0;
			return null;
		}
	}
}
