package com.java.patterns.structural.facade;

// 1. Subsystem
class PointCarte {
    private double x, y;

    public PointCarte(final double xx,
                      final double yy) {
        this.x = xx;
        this.y = yy;
    }

    public void move(final int dx,
                     final int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}

// 1. Subsystem
class PointPolar {
    private final double radius;
    private double angle;

    public PointPolar(final double r,
                      final double a) {
        this.radius = r;
        this.angle = a;
    }

    public void rotate(final int ang) {
        this.angle += ang % 360;
    }

    @Override
    public String toString() {
        return "[" + this.radius + "@" + this.angle + "]";
    }
}

// 1. Desired interface: move(), rotate()
class Point {
    private PointCarte pc; // 2. Design a "wrapper" class

    public Point(final double xx,
                 final double yy) {
        this.pc = new PointCarte(xx,
                                 yy);
    }

    @Override
    public String toString() {
        return this.pc.toString();
    }

    // 4. Wrapper maps
    public void move(final int dx,
                     final int dy) {
        this.pc.move(dx,
                     dy);
    }

    public void rotate(final int angle,
                       final Point o) {
        final double x = this.pc.getX() - o.pc.getX();
        final double y = this.pc.getY() - o.pc.getY();
        final PointPolar pp = new PointPolar(Math.sqrt((x * x) + (y * y)),
                                             (Math.atan2(y,
                                                         x) * 180) / Math.PI);
        // 4. Wrapper maps
        pp.rotate(angle);
        System.out.println("  PointPolar is " + pp);
        final String str = pp.toString();
        final int i = str.indexOf('@');
        final double r = Double.parseDouble(str.substring(1,
                                                          i));
        final double a = Double.parseDouble(str.substring(i + 1,
                                                          str.length() - 1));
        this.pc = new PointCarte((r * Math.cos((a * Math.PI) / 180)) + o.pc.getX(),
                                 (r * Math.sin((a * Math.PI) / 180)) + o.pc.getY());
    }
}

class Line {
    private final Point o, e;

    public Line(final Point ori,
                final Point end) {
        this.o = ori;
        this.e = end;
    }

    public void move(final int dx,
                     final int dy) {
        this.o.move(dx,
                    dy);
        this.e.move(dx,
                    dy);
    }

    public void rotate(final int angle) {
        this.e.rotate(angle,
                      this.o);
    }

    @Override
    public String toString() {
        return "origin is " + this.o + ", end is " + this.e;
    }
}

class FacadeDemo {
    public static void main(final String[] args) {
        // 3. Client uses the Facade
        final Line line1 = new Line(new Point(2,
                                              4),
                                    new Point(5,
                                              7));
        line1.move(-2,
                   -4);
        System.out.println("after move:  " + line1);
        line1.rotate(45);
        System.out.println("after rotate: " + line1);
        final Line line2 = new Line(new Point(2,
                                              1),
                                    new Point(2.866,
                                              1.5));
        line2.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + line2);
    }
}