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
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Chọn giống cho 12 nông dân ở Tây Nguyên");
		GiongCayTrongFactory tayNguyenFactory = new TayNguyenFactory();
		for (int i = 1; i <= 12; i++) {
			Giong giongDuocChon = tayNguyenFactory.chonGiong();
			System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon.showTenGiong()));
		}
		System.out.println("-----");
		System.out.println("Chọn giống cho 12 nông dân ở Đồng bằng sông Cửu Long");
		GiongCayTrongFactory dbSCLFactory = new DBSongCuuLongFactory();
		for (int i = 1; i <= 12; i++) {
			Giong giongDuocChon = dbSCLFactory.chonGiong();
			System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon.showTenGiong()));
		}
	}
    
}
