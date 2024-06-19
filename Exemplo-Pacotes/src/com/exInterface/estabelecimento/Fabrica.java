package com.exInterface.estabelecimento;

import com.exInterface.equipamentos.copiadora.Copiadora;
import com.exInterface.equipamentos.digitalizadora.Digitalizadora;
import com.exInterface.equipamentos.impressora.Deskjet;
import com.exInterface.equipamentos.impressora.Impressora;
import com.exInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
