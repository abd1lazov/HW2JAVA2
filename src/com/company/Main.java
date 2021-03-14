package com.company;

public class Main {

    public static void main(String[] args) {
        creatObject("Real_Madrid");
        System.out.println("------------");
        creatObject("Barcelona");
        System.out.println("---------------");
        creatObject("Psg");


    }
    public static Football creatObject(String className){
        switch (className){
            case "Real_Madrid":
                Real_Madrid real_madrid = new Real_Madrid(5,3,"Обладатель пяти кубков");
                real_madrid.print();
              return real_madrid;

            case "Barcelona":
                Barcelona barcelona = new Barcelona(3,6,1899);
                barcelona.print();
                return barcelona;

            case "Psg":
                Psg psg = new Psg(2,0,"9");
                psg.print();
                return psg;
    }
    return null;
}

}



