package service;

import dao.IDao;
import model.Filial;

public class FilialService {
    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial create(Filial endereco){
        return filialIDao.create(endereco);
    }
}
