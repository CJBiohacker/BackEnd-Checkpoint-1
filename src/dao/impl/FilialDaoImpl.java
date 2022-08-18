package dao.impl;

import dao.ConfigJDBC;
import dao.IDao;
import model.Filial;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static org.apache.logging.log4j.FormatterLoggerManualExample.logger;

public class FilialDaoImpl implements IDao<Filial> {
    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(FilialDaoImpl.class);

    public FilialDaoImpl(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }
    @Override
    public Filial create(Filial filial) {
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO filial(nomeFilial,rua,numero,cidade,estado,eCincoEstrelas) VALUES('%s','%s','%s','%s','%s','%s')",
                filial.getNome(), filial.getRua(), filial.getNumerorua(), filial.getCidade(), filial.getEstado(), filial.isCincoeEstrelas());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                filial.setId(resultSet.getInt(1));
            }
            logger.debug("Salvando filial: " + filial.toString());
            connection.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return filial;
    }
}
