import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class VerificacaoLogin {

    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(VerificacaoLogin.class);

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando o processamento do pagamento {}", i);

            switch (i) {
                case 1:
                case 4:
                    logger.error("Erro ao processar o pagamento {}: Falha na transação.", i);
                    break;
                case 5:
                    logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                    break;
                default:
                    logger.info("Pagamento {} processado com sucesso.", i);
                    break;
            }
        }

        logger.info("Processamento de pagamentos concluído.");
    }
}
