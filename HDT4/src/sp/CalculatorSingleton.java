package sp;

public class CalculatorSingleton {
    private static CalculatorSingleton instance = null;

    private CalculatorSingleton() {

    }


    public static CalculatorSingleton getInstance() {
        if (instance == null) {
            instance = new CalculatorSingleton();
        }
        return instance;
    }

    private Integer parser(String value) {

        try {
            return Integer.parseInt(value);
        } catch (Exception ex) {
            return null;
        }
    }
  

    public String ItoPCalc(String ex, int im) {
        ex = ex.trim();
        char[] datos = ex.toCharArray();
        String Operadores = "^()+/*-";
            

        StackFactroy<String> pilaFac = new StackFactroy<>(im);
        IStack<String> pila = pilaFac.getInstance();
        String post = "";

        for (int i = 0; i < ex.length(); i++) {

            String character = String.valueOf(datos[i]).trim();

            if (character.length() == 0) continue;

            if (parser(character) != null) {
                post += character;
            } else {
                if (!Operadores.contains(character)) {
                    throw new IllegalArgumentException("Caracter no valido: " + character);
                }

                if (character.equals("(")) {
                    pila.push(character);
                } else if (character.equals(")")) {

                    while (!pila.isEmpty())
                        if (!pila.peek().equals("("))
                            post += pila.pull();
                        else {
                            pila.pull();
                            break;
                        }
                } else if (parser(pila.peek()) == null && !pila.isEmpty() && prece(pila.peek()) > prece(character)) {
                    post += pila.pull();
                    pila.push(character);
                } else
                    pila.push(character);
            }
        }
            while (!pila.isEmpty()) {
                post += pila.pull();
            }
        
        return post.replace("", " ").trim();
    }

    public double calculate(String ex) {

        String[] datos = ex.split(" ");
        StackArrayList<Integer> pila = new StackArrayList<>();
        double obtiene = 0;
        for (String dato : datos) {
            
            if(dato.trim() != ""){

            Integer digito = parser(dato);

            if (digito != null) {
                pila.push(digito);
            }

            else {
                  String signo = dato.trim();
                  String signos = "^()+/*-";

                if (!signos.contains(dato)){
                    throw new IllegalArgumentException(
                            "No puede hacerse esta operacion con la calculadora implementada");
                }

                int x = pila.pull();
                int y = pila.pull();

                switch (signo) {
                    case "+":
                        obtiene = x + y;
                        break;
                    case "-":
                        obtiene = x - y;
                        break;
                    case "*":
                        obtiene = x * y;
                        break;
                    case "/":
                        obtiene = (double) x / (double) y;
                        break;
                    case "^":
                        obtiene = Math.pow(x, y);
                        break;
                }

                    pila.push((int) obtiene);
                }
            }
        }
            return obtiene;
    }

        public double IN (String ex, int im){

            String postfix = ItoPCalc(ex, im);
            return calculate(postfix);
        }
        
        private int prece(String op) {

            switch (op) {
    
                case "^":
                    return 2;
                case "*":
                    return 1;
                case "/":
                    return 1;
                case "+":
                    return 0;
                case "-":
                    return 0;
                default:
                    return -1;
    
            }
        }


}