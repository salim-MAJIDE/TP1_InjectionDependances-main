package metier;

import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{

    private IDAO dao;
    public MetierImpl(IDAO dao) {
        this.dao = dao;
    }
    @Override
    public double calculer() {
        double tmp=dao.getData();
        double res=tmp*540/100;
        return res;
    }
//pour injecter dans la variable dao un objet qui implemente IDAO
    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
