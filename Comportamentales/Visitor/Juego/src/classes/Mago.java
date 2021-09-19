package classes;

import interfaces.IPersonaje;
import interfaces.IVisitor;

public class Mago implements IPersonaje {
        
        private String arma;
        private String nombre;
        
        // constructores
        public Mago(){
            
            this.arma = "";
            this.nombre = "";

        }
        
        public Mago(String arma, String nombre){
            this.arma = arma;
            this.nombre = nombre;
        }
        
        // Getter y Setter
        
        public String getArma() {
            return arma;
        }

        public String getNombre() {
            return nombre;
        }
        
        public void setArma(String arma) {
            this.arma = arma;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public void accept(IVisitor visitor){
            visitor.visit(this);
        }

}
