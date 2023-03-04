public class EmpregodaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos (){
        return this.salario + 40;
    }
    public void bonus (double salario){
        salario = salario+horasAula;
    }


    String getInfo(){
        return "nome:" + this.nome + "com salario" + this.salario;
    }

}

