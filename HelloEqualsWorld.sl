(*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.
 mvn package -DskipTests
 ./sl ./HelloEqualsWorld.sl
 --engine.TraceCompilationDetails
 *)

fun doIt(a) {
  var hello;
  write("Initial stack trace:");
  write(stacktrace());
  
  hello := 123;
  write("After 123 assignment:");
  write(stacktrace());
  
  helloEqualsWorld();
  write("After hello assignment:");
  write(stacktrace())
  
--  readln()@
}

fun one() {
  1
}

fun changeGlobal() {
    i := i + 12345;
    write(i)
}

fun testLam() {
   fun two() {
      2
   }
   write(two())
}

fun testLam2() {
   (((fun two2() {
      2
   }
   write(two2()))))
}

fun testLam3() {
    var a = 10;
    fun getA() {
        a
    }
    write(getA())
}

fun testLam4() {
    fun printA(a) {
        write(a)
    }
    printA(123456)
}

fun testLam5() {
    fun tstInt1() { --///
        write("OK")
    }
    var xxxx;
    xxxx := tstInt1;
    xxxx()
}

fun testLam6() {
    var yyyy;
    yyyy := fun () {
        write("OK")
    };
    yyyy()
}

fun testLam7() {
    fun tst() {
        write(stacktrace())
    }
    tst()
}

fun fX() {
    fun fX() {
        1
    }
    write(fX())
}

fun testLam8() {
    var testLam7 = 0;
    write(testLam7)
}

var i;
var k = 0;
var j = k * 15 * 15;
var ijk = 11;
var arr;
var arr2 = [1, 2, 3];

-- i := one;
i := 0;
write("ijk test");
write(ijk);
(
var ijk = 0;
write(ijk)
);
write(ijk);
write("ijk test end");

write(one() + 2);

arr := Cons(1, 2, 3);
write(arr[0]);
arr[0] := 10000;
write(arr[0]);
();
arr := [1, 2, 3, 4, 5];
write(arr[4]);
arr[0] := 10000;
if 1 then write("YES") else write("NO") fi;

if 1 then else fi;

while 0 do od;

do while 0 od;

for , 0, skip do
od;

write("FOR");
for var i = 0; var j; j := 1; write(i), i < 5, i := i + 1 do
  --var i = 0, j = 0;
  write(stacktrace());
  write(i);
  write(j)
od;
write("ENDFOR");
do
  var s = 5;
  s := s - 1;
  write(s)
while s > 0 od;
write("OK");
while i < 10 do
  skip;
  write("begin ifs");
  k := if (i < 4) then
    101
  else
    111
  fi;
  write(k);
  write("end if val");
  if (i < 4) then
    write("if")
  fi;
  write("end if1");
  if (i < 4) then
    write("if")
  else
    write("else")
  fi;
  write("end if2");
  if (i < 4) then
    write("if3")
  elif (i < 5) then
    write("elif31")
  elif (i < 6) then
    write("elif32")
  else
    write("else3")
  fi;
  write("end ifs");
  doIt(i);
  i := i + 1
od;
case arr2 of
    0 -> write("0")
    | 1 -> write("1")
    | 239 -> write("239")
    | a@[1, b@_, 3] -> write(b)
    | a@[1, _, 1] -> write("err")
esac;
changeGlobal();
changeGlobal();
changeGlobal();
testLam2();
testLam3();
testLam4();
testLam5();
testLam6();
testLam7();
fX();
testLam8();
0

