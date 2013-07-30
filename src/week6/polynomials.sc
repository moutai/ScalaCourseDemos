package week6



object polynomials{

val p1 = new Poly(Map(1->2.0,3->4.0, 5->6.2))     //> p1  : week6.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1

val p2 = new Poly(Map(0->3.0, 3-> 7.0))           //> p2  : week6.Poly = 7.0x^3 + 3.0x^0

p1 + p2                                           //> res0: week6.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0



val p3 = new PolyFoldleft(Map(1->2.0,3->4.0, 5->6.2))
                                                  //> p3  : week6.PolyFoldleft = 6.2x^5 + 4.0x^3 + 2.0x^1

val p4 = new PolyFoldleft(Map(0->3.0, 3-> 7.0))   //> p4  : week6.PolyFoldleft = 7.0x^3 + 3.0x^0

p3 + p4                                           //> res1: week6.PolyFoldleft = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0
}