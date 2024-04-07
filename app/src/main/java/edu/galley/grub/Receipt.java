package edu.galley.grub;

public class Receipt implements Ticket {
    private Comanda comanda;

    public Receipt(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public Comanda getOrder(){
        return this.comanda;
    }
    public Double total(){
        this.getOrder().updateTotal();
        return this.getOrder().getTotal();
    }

    public void print(){
        System.out.println(this.toString());
    }

    public String toString(){
        return new StringBuilder(this.getOrder().toString())
        .append("Total --------> ")
        .append(this.total())
        .append("$")
        .toString();
    }


}
