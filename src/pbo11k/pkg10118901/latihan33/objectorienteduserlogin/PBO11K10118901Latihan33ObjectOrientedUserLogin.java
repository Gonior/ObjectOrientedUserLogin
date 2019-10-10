/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan33.objectorienteduserlogin;
import java.util.*;
/**
 *
 * @author 
 * NAMA                 : Dedi Cahya
 * KELAS                : PBO11K
 * NIM                  : 10118901
 * Deskripsi Program    : Membuat user login dengan konsep orientasi objek
 * 
 */
public class PBO11K10118901Latihan33ObjectOrientedUserLogin {

    public static Scanner input = new Scanner(System.in);
    public static User user = new User();
    private static String usName;
    private static String passWord;
    public static void main(String args[])
    { 
	System.out.print("Masukan Username : ");
	usName = input.nextLine();
	System.out.print("Masukan Password : ");
	passWord = input.nextLine();
        System.out.println("");
        user.pengecekanLogin(usName, passWord);
        
    }
    
}
