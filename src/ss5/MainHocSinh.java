package ss5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainHocSinh {
        public static void main(String[] args) {
            //    HocSinh[] hs = new HocSinh[10];
            ArrayList<HocSinh> hs = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            for (int i=0;i<10;i++){
                System.out.println("Nhap ten:");
                String ten = sc.nextLine();
                System.out.println("Nhap ngay sinh:");
                String ns = sc.nextLine();
                System.out.println("Dia chi:");
                String dc = sc.nextLine();
                System.out.println("Lop:");
                String lh = sc.nextLine();
                System.out.println("Diem trung binh:");
                double tb = sc.nextDouble();
                hs.add(new HocSinh(ten,ns,dc,lh,tb));
            }

            //    for (int i=0;i<hs.length;i++){
            //     for (int j=0;j< hs.length-1;j++){
            //      if (hs[j].getDiemtrungbinh() < hs[j+1].getDiemtrungbinh()){
            //             HocSinh tmp;
            //       tmp = hs[j];
            //         hs[j] = hs[j+1];
            //          hs[j+1] = tmp;
            //       }
            //      }
            //    }
            //  for (int i=0;i< hs.length;i++) {
            //       hs[i].inThongTin();
            //   }
            //    for (int i = 0; i<hs.length;i++){
            ///       if (hs[i].getDtb()>=9.5)
            //          hs[i].inThongTin();
            //   }
            //     for (int i = 0; i<hs.length;i++){
            //  if (hs[i].getDtb()>=8)
            //           hs[i].inThongTin();
            ////   }
            ///   for (int i = 0; i<hs.length;i++){
            //      if (hs[i].getDiemtrungbinh()>=6)
            ///          hs[i].inThongTin();
            //   }
            //    for (int i = 0; i<hs.length;i++){
            //       if (hs[i].getDtb()>=4)
            //       hs[i].inThongTin();
            //     }
            //   for (int i = 0; i<hs.length;i++){
            //        if (hs[i].getDiemtrungbinh()<4)
            //           hs[i].inThongTin();
            //  }

            Collections.sort(hs, new Comparator<HocSinh>(){
                @Override
                public int compare(HocSinh o1, HocSinh o2){
                    return o1.getDiemtrungbinh() - o2.getDiemtrungbinh()>0? 0:-1;
                }
            });
        }
    }