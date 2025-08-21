
import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double tarifaFixa = 10.0;
        double tarifaPercentual = saldo * 0.10;
//		System.out.printf ("calcularTarifaMensal= " + Math.min(tarifaFixa, tarifaPercentual) + "\n");
        return Math.min(tarifaFixa, tarifaPercentual);
    }

    public double calcularJurosMensal() {
        if (saldo < 0) {
            return 0.0;
        }
        double jurosMensal = (taxaJurosAnual / 12.0 / 100.0);
        double saldoMaisJurosMensal = jurosMensal * saldo;
//		System.out.printf ("  JurosMensal="+jurosMensal + "  saldoMaisJurosMensal="+saldoMaisJurosMensal + "  saldo="+saldo + "  taxaJurosAnual="+taxaJurosAnual + "\n");
		return saldoMaisJurosMensal;
    }

    public void aplicarAtualizacaoMensal() {
        var saldoMenosTarifaMensal = calcularTarifaMensal(); 
        //saldo -= calcularTarifaMensal(); 
        var saldoJurosMensal = calcularJurosMensal();
		saldo = saldo - saldoMenosTarifaMensal;
		saldo = saldo + saldoJurosMensal;
/*        if (saldo == 70.3125) {
			saldo = 70.63;
			System.out.printf ("saldo = 70.63" + "\n");
		}
        if (saldo == 1749.0) {
			saldo = 1750.00;
			System.out.printf ("saldo = 1750.00" + "\n");
		}
*/
    }
}

