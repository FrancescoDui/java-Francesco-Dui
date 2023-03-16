package eserciziList;
public class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public  String toString(){
            if(next==null)
                return String.valueOf(value);
            else
                return  value+" "+next.toString();
        }
        public int get(int i){
            /*if(i<0){
                System.out.println("Errore");
                return -1;
            }*/
            if(i==0)
                return value;
            else
                return next.get(i-1);
        }
        public void addTop(int i){
            //creo un nuovo nodo che ha lo stesso value e stesso next
            Node n1=new Node(this.value,this.next);
            //modifico il mio next in modo che sia quello appena creato
            this.next=n1;
            //modifico il value in modo che sia quello passato
            this.value=i;
        }
        public void set(int v,int i){
            if(i==0)
                value=v;
            else
                next.set(v,i-1);
        }
        public void add(int v){
            if(this.next==null)
               this.next=new Node(v);
            else
                next.add(v);
        }
    }//end Node
