package challenges.veiculo.mock;

import challenges.veiculo.model.*;

import java.util.Arrays;
import java.util.List;

public class Mock {

    private Mock(){

    }

    public static List<Carro> carros() {
        return Arrays.asList(
                // carros
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

                // motos
                // BMW

                // Harley-Davidson

                // Honda

                // Kawasaki

                // KTM

                // Yamaha

                // Triumph

                // Caminhões
                // Scania

                // Volvo

                // Iveco

                // ---


                );
        }
}
