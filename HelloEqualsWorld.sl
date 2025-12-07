(*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.
 *)

func doIt(a) {
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

var i;
var k = 0;
var j = k * 15 * 15;
i := 0;
while i < 10 do
  write("begin ifs");
  if (i < 4) then
    write("if")
  fi;
  write("end if1");
  if (i < 4) then
    write("if")
  else
    write("else")
  fi;
  write("end ifs");
  doIt(i);
  i := i + 1
od;
0

