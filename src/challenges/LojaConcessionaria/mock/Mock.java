package challenges.LojaConcessionaria.mock;

import challenges.LojaConcessionaria.exceptions.SaldoInvalidoException;
import challenges.LojaConcessionaria.exceptions.VeiculoNaoEncontradoException;
import challenges.LojaConcessionaria.model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mock {

    private Mock(){

    }

    // VEICULOS
    public static List<Carro> carros() {
        return Arrays.asList(
                // ------------------------------------------CARROS-------------------------------------------------- //
                // Audi - 4
                new Carro("Audi", "A3 Sportback", 2022, 220000, 4, true, new Motor(190, TipoCombustivel.GASOLINA)),
                new Carro("Audi", "A5 Coupé", 2016, 120000, 2, true, new Motor(252, TipoCombustivel.GASOLINA)),
                new Carro("Audi", "S6 Avant", 2014, 235000, 4, true, new Motor(450, TipoCombustivel.GASOLINA)),
                new Carro("Audi", "A7 Sportback", 2022, 475000, 4, true, new Motor(340, TipoCombustivel.GASOLINA)),

                // BMW - 4
                new Carro("BMW", "320i", 2025, 309800, 4, true, new Motor(184, TipoCombustivel.GASOLINA)),
                new Carro("BMW", "M240i", 2018, 290500, 2, true, new Motor(340, TipoCombustivel.GASOLINA)),
                new Carro("BMW", "i3", 2019, 175100, 4, true, new Motor(170, TipoCombustivel.ELETRICO)),
                new Carro("BMW", "M135i", 2022, 282300, 4, true, new Motor(306, TipoCombustivel.GASOLINA)),

                // Chevrolet - 10
                new Carro("Chevrolet", "Astra", 2011, 36200, 4, false, new Motor(140, TipoCombustivel.FLEX)),
                new Carro("Chevrolet", "Bolt EUV", 2023, 194900, 4, true, new Motor(200, TipoCombustivel.ELETRICO)),
                new Carro("Chevrolet", "C20", 1996, 27900, 2, false, new Motor(150, TipoCombustivel.GASOLINA)),
                new Carro("Chevrolet", "Celta", 2015, 35000, 4, false, new Motor(78, TipoCombustivel.FLEX)),
                new Carro("Chevrolet", "Corsa", 2012, 30000, 4, false, new Motor(105, TipoCombustivel.FLEX)),
                new Carro("Chevrolet", "Camaro", 2023, 450050, 2, true, new Motor(455, TipoCombustivel.GASOLINA)),
                new Carro("Chevrolet", "Trailblazer", 2021, 205900, 4, true, new Motor(200, TipoCombustivel.DIESEL)),
                new Carro("Chevrolet", "Spin", 2025, 112200, 4, true, new Motor(111, TipoCombustivel.FLEX)),
                new Carro("Chevrolet", "Onix Plus", 2024, 76500, 4, true, new Motor(116, TipoCombustivel.FLEX)),
                new Carro("Chevrolet", "S10", 2023, 155900, 4, true, new Motor(200, TipoCombustivel.DIESEL)),

                // Fiat - 10
                new Carro("Fiat", "147", 1987, 6000, 2, false, new Motor(60, TipoCombustivel.GASOLINA)),
                new Carro("Fiat", "Doblô", 2018, 57800, 4, true, new Motor(132, TipoCombustivel.FLEX)),
                new Carro("Fiat", "Freemont", 2016, 68000, 4, true, new Motor(172, TipoCombustivel.GASOLINA)),
                new Carro("Fiat", "Marea Weekend", 2008, 38000, 4, false, new Motor(127, TipoCombustivel.GASOLINA)),
                new Carro("Fiat", "Palio Weekend", 2018, 45000, 4, true, new Motor(88, TipoCombustivel.FLEX)),
                new Carro("Fiat", "Palio", 2017, 38000, 4, true, new Motor(88, TipoCombustivel.FLEX)),
                new Carro("Fiat", "Strada", 2025, 98000, 2, true, new Motor(116, TipoCombustivel.FLEX)),
                new Carro("Fiat", "Uno", 2022, 52060, 4, true, new Motor(77, TipoCombustivel.FLEX)),
                new Carro("Fiat", "Toro", 2023, 140000, 4, true, new Motor(170, TipoCombustivel.DIESEL)),
                new Carro("Fiat", "Fastback", 2024, 120050, 4, true, new Motor(185, TipoCombustivel.GASOLINA)),

                // Ford - 7
                new Carro("Ford", "Bronco Sport", 2023, 208000, 4, true, new Motor(253, TipoCombustivel.GASOLINA)),
                new Carro("Ford", "Fusion", 2019, 125800, 4, true, new Motor(248, TipoCombustivel.HIBRIDO)),
                new Carro("Ford", "Focus Hatch", 2018, 72000, 4, true, new Motor(176, TipoCombustivel.FLEX)),
                new Carro("Ford", "Ka", 2020, 56000, 4, true, new Motor(85, TipoCombustivel.FLEX)),
                new Carro("Ford", "Mustang Mach-E", 2024, 460000, 4, true, new Motor(480, TipoCombustivel.ELETRICO)),
                new Carro("Ford", "Mustang", 2022, 465000, 2, true, new Motor(450, TipoCombustivel.GASOLINA)),
                new Carro("Ford", "Territory", 2025, 194500, 4, true, new Motor(190, TipoCombustivel.GASOLINA)),

                // Honda - 3
                new Carro("Honda", "Accord", 2020, 195000, 4, true, new Motor(252, TipoCombustivel.HIBRIDO)),
                new Carro("Honda", "Civic", 2024, 230000, 4, true, new Motor(182, TipoCombustivel.GASOLINA)),
                new Carro("Honda", "City Hatch", 2024, 129000, 4, true, new Motor(126, TipoCombustivel.FLEX)),

                // Hyundai - 4
                new Carro("Hyundai", "Azera", 2021, 202800, 4, true, new Motor(290, TipoCombustivel.GASOLINA)),
                new Carro("Hyundai", "Santa Fé", 2022, 198000, 4, true, new Motor(280, TipoCombustivel.GASOLINA)),
                new Carro("Hyundai", "Sonata", 2014, 73000, 4, true, new Motor(180, TipoCombustivel.GASOLINA)),
                new Carro("Hyundai", "Tucson", 2024, 168050, 4, true, new Motor(180, TipoCombustivel.GASOLINA)),

                // VW - 11
                new Carro("VW", "ID.4", 2023, 128000, 4, true, new Motor(204, TipoCombustivel.ELETRICO)),
                new Carro("VW", "Nivus", 2021, 101000, 4, true, new Motor(128, TipoCombustivel.GASOLINA)),
                new Carro("VW", "New Beetle", 2010, 54000, 2, false, new Motor(116, TipoCombustivel.GASOLINA)),
                new Carro("VW", "Amarok", 2022, 180000, 4, true, new Motor(258, TipoCombustivel.DIESEL)),
                new Carro("VW", "Gol", 2018, 52000, 4, true, new Motor(84, TipoCombustivel.FLEX)),
                new Carro("VW", "Golf", 2020, 170500, 4, true, new Motor(150, TipoCombustivel.GASOLINA)),
                new Carro("VW", "Passat CC", 2014, 120300, 4, true, new Motor(211, TipoCombustivel.GASOLINA)),
                new Carro("VW", "Polo", 2020, 70000, 4, true, new Motor(116, TipoCombustivel.FLEX)),
                new Carro("VW", "Up!", 2020, 62300, 4, true, new Motor(82, TipoCombustivel.FLEX)),
                new Carro("VW", "Taos", 2024, 168000, 4, true, new Motor(150, TipoCombustivel.GASOLINA)),
                new Carro("VW", "Saveiro", 2019, 75000, 2, true, new Motor(110, TipoCombustivel.FLEX)),

                // RAM - 1
                new Carro("Dodge", "RAM 3500", 2024, 450600, 4, true, new Motor(377, TipoCombustivel.DIESEL)),

                // Lamborghini - 1
                new Carro("Lamborghini", "Huracán", 2024, 4805000, 2, true, new Motor(640, TipoCombustivel.GASOLINA)),

                // Ferrari - 3
                new Carro("Ferrari", "488 Pista", 2020, 5400800, 2, true, new Motor(720, TipoCombustivel.GASOLINA)),
                new Carro("Ferrari", "812 Superfast", 2023, 6800250, 2, true, new Motor(800, TipoCombustivel.GASOLINA)),
                new Carro("Ferrari", "F8 Tributo", 2022, 4350000, 2, true, new Motor(720, TipoCombustivel.GASOLINA)),

                // Mitsubishi - 4
                new Carro("Mitsubishi", "Lancer Evolution", 2015, 240500, 4, true, new Motor(295, TipoCombustivel.GASOLINA)),
                new Carro("Mitsubishi", "Outlander", 2020, 148050, 4, true, new Motor(166, TipoCombustivel.GASOLINA)),
                new Carro("Mitsubishi", "Pajero Sport", 2024, 325000, 4, true, new Motor(190, TipoCombustivel.DIESEL)),
                new Carro("Mitsubishi", "Triton", 2020, 140050, 4, true, new Motor(190, TipoCombustivel.DIESEL)),

                // Toyota - 7
                new Carro("Toyota", "Camry", 2020, 175900, 4, true, new Motor(203, TipoCombustivel.GASOLINA)),
                new Carro("Toyota", "Corolla", 2025, 160800, 4, true, new Motor(170, TipoCombustivel.HIBRIDO)),
                new Carro("Toyota", "Prius", 2017, 81600, 4, true, new Motor(122, TipoCombustivel.HIBRIDO)),
                new Carro("Toyota", "SW4", 2024, 389000, 4, true, new Motor(204, TipoCombustivel.DIESEL)),
                new Carro("Toyota", "Yaris", 2023, 95800, 4, true, new Motor(107, TipoCombustivel.FLEX)),

                // LandRover - 1
                new Carro("Land Rover", "Range Rover Sport", 2025, 1020900, 4, true, new Motor(400, TipoCombustivel.GASOLINA)),

                // GWM
                new Carro("GWM", "Haval H6 GT", 2025, 298400, 4, true, new Motor(393, TipoCombustivel.HIBRIDO)),
                new Carro("GWM", "Ora 03", 2024, 140000, 4, true, new Motor(171, TipoCombustivel.ELETRICO)),

                // Porsche - 4
                new Carro("Porsche", "718", 2024, 800900, 2, true, new Motor(300, TipoCombustivel.GASOLINA)),
                new Carro("Porsche", "Cayman", 2016, 808000, 2, true, new Motor(350, TipoCombustivel.GASOLINA)),
                new Carro("Porsche", "Taycan", 2020, 798000, 4, true, new Motor(408, TipoCombustivel.ELETRICO)),
                new Carro("Porsche", "Panamera", 2023, 748500, 4, true, new Motor(330, TipoCombustivel.GASOLINA)),

                // Mercedes - 4
                new Carro("Mercedes-Benz", "A35 AMG", 2023, 360800, 4, true, new Motor(306, TipoCombustivel.GASOLINA)),
                new Carro("Mercedes-Benz", "Classe CLC", 2011, 62500, 2, false, new Motor(156, TipoCombustivel.GASOLINA)),
                new Carro("Mercedes-Benz", "GLA 45 AMG", 2019, 258600, 4, true, new Motor(381, TipoCombustivel.GASOLINA)),
                new Carro("Mercedes-Benz", "GLB 35 AMG", 2025, 526000, 4, true, new Motor(306, TipoCombustivel.GASOLINA))

        );
    }

    public static List<Moto> motos() {
        return Arrays.asList(
                // --------------------------------------------MOTOS------------------------------------------------- //
                // BMW - 5
                new Moto("BMW", "F 900R", 2023, 56800, new Motor(105, TipoCombustivel.GASOLINA), 895, true),
                new Moto("BMW", "R 1250 GS", 2022, 99700, new Motor(136, TipoCombustivel.GASOLINA), 1254, true),
                new Moto("BMW", "K 1600 Bagger", 2021, 172300, new Motor(160, TipoCombustivel.GASOLINA), 1649, true),
                new Moto("BMW", "S 1000 RR", 2025, 156050, new Motor(207, TipoCombustivel.GASOLINA), 999, true),
                new Moto("BMW", "S 1000 XR", 2020, 83650, new Motor(165, TipoCombustivel.GASOLINA), 999, true),

                // Harley-Davidson - 2
                new Moto("Harley-Davidson", "Sportster 1200", 2024, 115600, new Motor(68, TipoCombustivel.GASOLINA), 1202, true),
                new Moto("Harley-Davidson", "FAT BOB FXFBS", 2023, 111900, new Motor(94, TipoCombustivel.GASOLINA), 1868, true),

                // Honda - 13
                new Moto("Honda", "ADV", 2021, 35800, new Motor(18.9, TipoCombustivel.GASOLINA), 149, true),
                new Moto("Honda", "Biz 125i", 2020, 14850, new Motor(9.2, TipoCombustivel.GASOLINA), 124.9, true),
                new Moto("Honda", "CB 1000R", 2022, 70590, new Motor(143.5, TipoCombustivel.GASOLINA), 998, true),
                new Moto("Honda", "CB 250F", 2019, 17800, new Motor(22.4, TipoCombustivel.GASOLINA), 249.5, true),
                new Moto("Honda", "CB 500F", 2020, 32800, new Motor(50.4, TipoCombustivel.GASOLINA), 471, true),
                new Moto("Honda", "CBR 1000RR-R", 2024, 198500, new Motor(216.2, TipoCombustivel.GASOLINA), 999.9, true),
                new Moto("Honda", "CBR 650R", 2023, 53698, new Motor(88.4, TipoCombustivel.GASOLINA), 649, true),
                new Moto("Honda", "CG 150", 2008, 98710, new Motor(14.3, TipoCombustivel.FLEX), 149.2, true),
                new Moto("Honda", "CRF 1000L", 2023, 92540, new Motor(93.9, TipoCombustivel.GASOLINA), 998, true),
                new Moto("Honda", "CRF 250F", 2022, 21580, new Motor(22.2, TipoCombustivel.GASOLINA), 249.6, false),
                new Moto("Honda", "NC 750X", 2021, 44850, new Motor(58.6, TipoCombustivel.GASOLINA), 745, true),
                new Moto("Honda", "Pop 110i", 2020, 93650, new Motor(8.3, TipoCombustivel.GASOLINA), 109.1, true),
                new Moto("Honda", "XRE Sahara 300", 2024, 29870, new Motor(25.2, TipoCombustivel.GASOLINA), 293.5, true),

                // Kawasaki - 3
                new Moto("Kawasaki", "Ninja", 2023, 35000, new Motor(39, TipoCombustivel.GASOLINA), 399, true),
                new Moto("Kawasaki", "Z 900", 2024, 63500, new Motor(125, TipoCombustivel.GASOLINA), 948, true),
                new Moto("Kawasaki", "ZX-6R", 2025, 77950, new Motor(130, TipoCombustivel.GASOLINA), 636, true),

                // KTM - 2
                new Moto("KTM", "Duke 390", 2023, 32840, new Motor(43.5, TipoCombustivel.GASOLINA), 373.2, true),
                new Moto("KTM", "EXC-F 350", 2021, 55980, new Motor(45, TipoCombustivel.GASOLINA), 349.7, false),

                // Yamaha - 7
                new Moto("Yamaha", "Fazer 150", 2020, 14800, new Motor(12.2, TipoCombustivel.FLEX), 149, true),
                new Moto("Yamaha", "Fazer FZ25", 2021, 19850, new Motor(20.9, TipoCombustivel.FLEX), 249.5, true),
                new Moto("Yamaha", "MT-03", 2024, 31500, new Motor(42, TipoCombustivel.GASOLINA), 321, true),
                new Moto("Yamaha", "MT-09", 2024, 62250, new Motor(119, TipoCombustivel.GASOLINA), 889, true),
                new Moto("Yamaha", "Tracer 900 GT", 2023, 59840, new Motor(115, TipoCombustivel.GASOLINA), 847, true),
                new Moto("Yamaha", "XMax", 2022, 28940, new Motor(22.8, TipoCombustivel.GASOLINA), 249.8, true),
                new Moto("Yamaha", "XTZ 250 Lander", 2019, 19870, new Motor(20.7, TipoCombustivel.FLEX), 249.5, true),
                new Moto("Yamaha", "YZF R3", 2025, 33500, new Motor(42, TipoCombustivel.GASOLINA), 321, true),

                // Triumph
                new Moto("Triumph", "Tiger 900", 2020, 56800, new Motor(95.2, TipoCombustivel.GASOLINA), 888, true),
                new Moto("Triumph", "Rocket 3", 2021, 105000, new Motor(167, TipoCombustivel.GASOLINA), 2458, true),
                new Moto("Triumph", "Street Triple 765", 2023, 59840, new Motor(130, TipoCombustivel.GASOLINA), 765, true),
                new Moto("Triumph", "Speed 400", 2024, 29870, new Motor(39.5, TipoCombustivel.GASOLINA), 398.1, true)

        );
    }

    public static List<Caminhao> caminhoes() {
        return Arrays.asList(
                // -------------------------------------------CAMINHÕES---------------------------------------------- //
                // Scania
                new Caminhao("Scania", "S 560 6x4", 2024, 819000, new Motor(560, TipoCombustivel.DIESEL), true, 50000),
                new Caminhao("Scania", "P 250 B", 2019, 170179, new Motor(250, TipoCombustivel.DIESEL), false, 30000),

                // Volvo
                new Caminhao("Volvo", "FH 460 6x2", 2020, 530000, new Motor(460, TipoCombustivel.DIESEL), true, 45000),

                // Mercedes
                new Caminhao("Mercedes-Benz", "Actros 2548 S 6x2", 2024, 670000, new Motor(480, TipoCombustivel.DIESEL), true, 55000),
                new Caminhao("Mercedes-Benz", "Accelo 815", 2020, 237000, new Motor(150, TipoCombustivel.DIESEL), false, 25000)
        );
    }

    // USUARIOS
    public static List<Usuario> usuarios() {
        return Arrays.asList(
                new Usuario("Ruan", 9876543),
                new Usuario("Patrick", 8765432),
                new Usuario("Hyan", 8745623),
                new Usuario("William", 9638527),
                new Usuario("Johnny", 8523697),
                new Usuario("Daniel", 8745632),
                new Usuario("Wanderson", 9658741)
        );
    }

    // Garagens de usuários
    public static Map<Usuario, GaragemUsuario> garagensUsuarios(List<Usuario> usuarios) { // indica que este método retorna um mapa que associa objetos Usuario a objetos GaragemUsuario.
        Map<Usuario, GaragemUsuario> garagens = new HashMap<>(); // HashMap = chave-valor // chaves são objetos Usuario e valores são objetos GaragemUsuario
        for (Usuario usuario: usuarios) {
            garagens.put(usuario, new GaragemUsuario());
        }
        return garagens;
    }

    // loja / concessionaria
    // instâncias de LojaConcessionaria para simular diferentes lojas com diferentes estoques de veículos.
    public static List<LojaConcessionaria> lojasConcessionarias(List<Carro> carros, List<Moto> motos, List<Caminhao> caminhoes) {
        LojaConcessionaria loja1 = new LojaConcessionaria();
        // sublist - cria uma sublista dos 10 primeiros elementos da lista carros (adiciona os 10 primeiros carros da lista carros ao estoque da loja1)
        carros.subList(0, 10).forEach(loja1::adicionarVeiculo); // itera sobre cada carro na sublista e chama o método adicionarVeiculo() da loja1 para adicioná-lo ao estoque.
        motos.subList(0, 5).forEach(loja1::adicionarVeiculo);
        caminhoes.subList(0, 2).forEach(loja1::adicionarVeiculo);

        LojaConcessionaria loja2 = new LojaConcessionaria();
        carros.subList(10, 20).forEach(loja2::adicionarVeiculo);
        motos.subList(5, 10).forEach(loja2::adicionarVeiculo);
        caminhoes.subList(2, 4).forEach(loja2::adicionarVeiculo);

        LojaConcessionaria loja3 = new LojaConcessionaria();
        carros.subList(20, carros.size()).forEach(loja3::adicionarVeiculo);
        motos.subList(10, motos.size()).forEach(loja3::adicionarVeiculo);
        caminhoes.subList(4, caminhoes.size()).forEach(loja3::adicionarVeiculo);

        return Arrays.asList(loja1, loja2, loja3);  //  retorna uma lista contendo as três lojas criadas.
    }

    // métodos para simular interações de compra e venda entre usuários e lojas
    public static void simularCompra(Usuario usuario, Veiculo veiculo, GaragemUsuario garagemUsuario) {
        try {
            usuario.comprarVeiculo(veiculo, garagemUsuario);
            System.out.println(usuario.getNome() + " comprou " + veiculo.getModelo());
        } catch (SaldoInvalidoException e) {
            System.out.println(usuario.getNome() + " não tem saldo suficiente para comprar " + veiculo.getModelo());
        }
    }

    public static void simularVenda(Usuario usuario, Veiculo veiculo, GaragemUsuario garagemUsuario) {
        try {
            usuario.venderVeiculo(veiculo, garagemUsuario);
            System.out.println(usuario.getNome() + " vendeu " + veiculo.getModelo());
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(usuario.getNome() + " não possui " + veiculo.getModelo() + " para vender.");
        }
    }

    // método para listar os veículos de uma loja ou garagem
    public static void listarVeiculos(LojaConcessionaria loja) {
        System.out.println("Lista de veículos na loja:");
        loja.listarVeiculos();
    }

}
