package GuiaObjetos1.ejercicio5;

public class Hora {

    private int dia;
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int sumeSeg(int segundo, int minuto, int hora, int dia){
        if(segundo < 59){
           return this.segundo = segundo + 1;
        }else{
            if(minuto < 59){
                this.segundo = 0;
                return this.minuto = minuto + 1;
            }else{
                if(hora < 24){
                    this.minuto = 0;
                    return this.hora = hora + 1;
                }else{
                    this.hora = 0;
                    this.dia = dia + 1;
                }
            }
        }
        return this.dia;
    }

    public int resteSeg(int segundo, int minuto, int hora, int dia){
        if(this.segundo > 0){
            return this.segundo = segundo - 1;
        }else{
            if(this.minuto > 0){
                this.segundo = 60;
                return this.minuto = minuto - 1;
            }
            else{
                if(this.hora > 0){
                    this.minuto = 60;
                    return this.hora = hora - 1;
                }
                else{
                    this.segundo = 60;
                    this.dia = dia - 1;
                }
            }
        }
        return this.dia;
    }

    public void mostrarHora(){
        boolean seg=false,hs=false,min=false;
         if(this.hora < 12){
             if(this.segundo < 10){seg = true;}
             if(this.minuto < 10){min = true;}
             if(this.hora < 10){hs = true;}

             if(seg && min && hs){
                 System.out.println("0"+this.hora + ":" + "0"+this.minuto + ":" + "0"+this.segundo + " am.");
             }else if (seg && min){
                 System.out.println(this.hora + ":" + "0"+this.minuto + ":" + "0"+this.segundo + " am.");
             }else if(seg && hs){
                 System.out.println("0"+this.hora + ":" + this.minuto + ":" + "0"+this.segundo + " am.");
             }else if(min && hs){
                 System.out.println("0"+this.hora + ":" + "0"+this.minuto + ":" + this.segundo + " am.");
             }else if(seg){
                 System.out.println(this.hora + ":" + this.minuto + ":" + "0" + this.segundo + " am.");
             }else if(min){
                 System.out.println(this.hora + ":" + "0"+this.minuto + ":" + this.segundo + " am.");
             }else if(hs){
                 System.out.println("0"+this.hora + ":" + this.minuto + ":" + this.segundo + " am.");
             }else{
                 System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo + " am.");
             }

         }else{
             if(this.segundo < 10){seg = true;}
             if(this.minuto < 10){min = true;}
             if(this.hora < 10){hs = true;}

             if(this.segundo < 10){seg = true;}
             if(this.minuto < 10){min = true;}
             if(this.hora < 10){hs = true;}

             if(seg && min && hs){
                 System.out.println("0"+this.hora + ":" + "0"+this.minuto + ":" + "0"+this.segundo + " pm.");
             }else if (seg && min){
                 System.out.println(this.hora + ":" + "0"+this.minuto + ":" + "0"+this.segundo + " pm.");
             }else if(seg && hs){
                 System.out.println("0"+this.hora + ":" + this.minuto + ":" + "0"+this.segundo + " pm.");
             }else if(min && hs){
                 System.out.println("0"+this.hora + ":" + "0"+this.minuto + ":" + this.segundo + " pm.");
             }else if(seg){
                 System.out.println(this.hora + ":" + this.minuto + ":" + "0" + this.segundo + " pm.");
             }else if(min){
                 System.out.println(this.hora + ":" + "0"+this.minuto + ":" + this.segundo + " pm.");
             }else if(hs){
                 System.out.println("0"+this.hora + ":" + this.minuto + ":" + this.segundo + " pm.");
             }else{
                 System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo + " pm.");
             }
         }
    }
}
