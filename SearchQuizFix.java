/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchquizfix;

/**
 *
 * @author ISMAH IRDHIYAH
 */
import java.util.Scanner;
public class SearchQuizFix {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
       String jenis[]={"Pensil","Penghapus","Penggaris","Pulpen", "Lem", "Kertas", "Gunting"         
       };
       boolean ketemu;
       int i,pilih=1;
       do{
       System.out.println("Program Pencarian");
       System.out.print("Jenis ATK: ");
       for(i=0;i<jenis.length;i++){
           System.out.print(jenis[i]+" ");
       }
       ketemu=false;
       System.out.println("");
       System.out.print("Cari Jenis ATK= ");
       String cari=s.next();
       for(i=0;i<jenis.length;i++){
           if(jenis[i].compareToIgnoreCase(cari)==0){
               ketemu=true;
               break;
           }
       }
       if(ketemu==true){
           System.out.println("Ada di nomor "+(i+1));
       }else{
           System.out.println("Tidak Ditemukan");          
           }
        System.out.println("Cari lagi?");
        System.out.println("[1.Ya][2.Tidak]");
        System.out.print("Jawab= ");
        pilih =s.nextInt();
        }while(pilih==1);
       System.out.println("Terimakasih...");
       }
    }