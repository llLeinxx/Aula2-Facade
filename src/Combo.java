public class Combo {

    private Burguer burguer = new Burguer();
    private Bebida bebida = new Bebida();
    private Sobremesa sobremesa = new Sobremesa();

    public int CriarCombo(int tipo){
        if (tipo == 1){
            /*tamanhos*/
            burguer.setGramas(200);
            bebida.setMl(400);
            sobremesa.Sobremesa("Medio");
            /*Burguer*/
            burguer.setPreco(20.00);
            burguer.setDescricao("Lanche: X-Bacon-"+burguer.getGramas()+"gr "+"R$"+burguer.getPreco()+"/");
            /*Bebida*/
            bebida.setPreco(10.00);
            bebida.setDescricao("Bebida: Coca-cola-"+bebida.getMl()+"ml "+"R$"+bebida.getPreco()+"/");
            /*Sobremesa*/
            sobremesa.setPreco(12.00);
            sobremesa.setDescricao("Sobremesa: Mousse de Maracujá-"+sobremesa.getTamanho()+" R$"+sobremesa.getPreco()+"/");
        } else if (tipo == 2) {
            /*tamanhos*/
            burguer.setGramas(400);
            bebida.setMl(400);
            sobremesa.Sobremesa("Grande");
            /*Burguer*/
            burguer.setPreco(25.00);
            burguer.setDescricao("Lanche: X-Tudo-"+burguer.getGramas()+"gr "+"R$"+burguer.getPreco()+"/");
            /*Bebida*/
            bebida.setPreco(8.00);
            bebida.setDescricao("Bebida: Guaraná-"+bebida.getMl()+"gr "+"R$"+bebida.getPreco()+"/");
            /*Sobremesa*/
            sobremesa.setPreco(15.00);
            sobremesa.setDescricao("Sobremesa: Pudim-"+sobremesa.getTamanho()+" R$"+sobremesa.getPreco()+"/");
        }
        return tipo;
    }
    @Override
    public String toString(){
        return burguer.getDescricao() + bebida.getDescricao() + sobremesa.getDescricao();
    }
}