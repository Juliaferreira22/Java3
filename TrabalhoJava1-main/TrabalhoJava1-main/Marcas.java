
enum Marcas {
    FIAT("Vermelho", 1800),
    RENAULT("Preto", 2000),
    VOLKSWAGEM("Branco", 2020); 

    private String nomeDono;
    private int anoFundacao; 

        private Marcas(String nomeDono, int anoFundacao){
            this.nomeDono = nomeDono;
            this.anoFundacao = anoFundacao; 
        }

        public String getnomeDono(){
            return nomeDono;
        }
    
        public int getanoFundacao(){
            return anoFundacao;
        }

}
