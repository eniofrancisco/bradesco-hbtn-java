import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ProcessamentoDePagamentos {

    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando o processamento do pagamento {}", i);

            try {
                Thread.sleep(1000); // Simula tempo de processamento
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("Processamento interrompido para o pagamento {}", i);
                continue;
            }

            int resultado = random.nextInt(3); // 0 = falha, 1 = sucesso, 2 = pendente

            switch (resultado) {
                case 0:
                    logger.error("Erro ao processar o pagamento {}: Falha na transação.", i);
                    break;
                case 1:
                    logger.info("Pagamento {} processado com sucesso.", i);
                    break;
                case 2:
                    logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                    break;
            }
        }

        logger.info("Processamento de pagamentos concluído.");
    }
}
