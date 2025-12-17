public class MethodsOfInheritance {
    public static void main(String[] args) {
        Plane p = new Plane("B737", 180);
        p.board(new Passengers("Alice", 70), new Passengers("Bob", 85), new Passengers("Carol", 60));
        p.fly(); p.info(); System.out.println();

        CargoPlane cp = new CargoPlane("An-124", 2, 50000);
        cp.load(20000); cp.load(35000);
        cp.board(new Passengers("Crew1", 80), new Passengers("Crew2", 75));
        cp.fly(); cp.info(); cp.unload(5000); cp.info(); System.out.println();

        FighterJet fj = new FighterJet("F-22", 1, 8);
        fj.board(new Passengers("Pilot", 90)); fj.fly(); fj.info();
        fj.engage("target drone"); fj.engage("bogey");
    }
}

class Plane {
    protected String model; protected int cap, cur;
    Plane(String m, int c) { model = m; cap = c; }
    void fly() { System.out.println(model + " cruising " + cur + "/" + cap); }
    void info() { System.out.println(model + " cap:" + cap + " cur:" + cur); }
    int board(Passengers... p) { int b = 0; for (Passengers x : p) if (cur < cap) { cur++; b++; System.out.println("Boarded: " + x); } else System.out.println("No seat: " + x); return b; }
    int deboard(int n) { int r = Math.min(n, cur); cur -= r; System.out.println("Deboarded " + r); return r; }
}

class CargoPlane extends Plane {
    int cargoCap, curCargo;
    CargoPlane(String m, int pc, int cc) { super(m, pc); cargoCap = cc; }
    @Override void fly() { System.out.println(model + " (cargo) " + curCargo + "kg and " + cur + " pax."); }
    @Override void info() { super.info(); System.out.println("Cargo:" + curCargo + "/" + cargoCap + "kg"); }
    boolean load(int w) { if (curCargo + w <= cargoCap) { curCargo += w; System.out.println("Loaded " + w); return true; } System.out.println("Cannot load " + w); return false; }
    int unload(int w) { int u = Math.min(w, curCargo); curCargo -= u; System.out.println("Unloaded " + u); return u; }
}

class FighterJet exten ds Plane {
    int missiles;
    FighterJet(String m, int pc, int ms) { super(m, pc); missiles = ms; }
    @Override void fly() { System.out.println(model + " (fighter) " + missiles + " missiles onboard."); }
    @Override void info() { super.info(); System.out.println("Missiles:" + missiles); }
    void engage(String t) { if (missiles-- > 0) System.out.println(model + " fires at " + t + " missiles left:" + missiles); else System.out.println(model + " no missiles for " + t); }
}

class Passengers {
    String name; int weight;
    Passengers(String n, int w) { name = n; weight = w; }
    public String toString() { return name + "(" + weight + "kg)"; }
}
