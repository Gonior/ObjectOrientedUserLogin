/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan33.objectorienteduserlogin;

/**
 *
 * @author 
 * NAMA                 : Dedi Cahya
 * KELAS                : PBO11K
 * NIM                  : 10118901
 * Deskripsi Program    : Membuat user login dengan konsep orientasi objek
 * 
 */
public class User {
    private String username;
    private String password;    
    private boolean statusAkun;
    
    private boolean cekAkun(String parUsername,String parPassword){
    	if((parUsername.equals("RizkiAdam"))&&(parPassword.equals("terbaikselalu"))) {
            statusAkun = true;
            return true;
        }
        else {
            statusAkun = false;
            return false;
        }
    }
    private void hasilLogin(boolean status,String parUsername) {
        if(status == true) {
            System.out.println("*****HALLO "+parUsername.toUpperCase()+"*****");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else 
            System.out.println("Ooops, Username atau Password anda salah");
    }
    public void pengecekanLogin(String parUsername,String parPassword) {
        username = parUsername;
        password = parPassword;
        cekAkun(username,password);
        hasilLogin(statusAkun,username);
    }
}
