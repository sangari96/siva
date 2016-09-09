fun partition(orgl, encode) =
let
    val part = size(orgl)
    fun backtrack(str, s, len, count, code) =
        let
           val current =
               if count = 1 then
                  code@[substring(str, s, size(str) - s)]
               else
                  code@[substring(str, s, len)]
        in
           if len > size(str) - s then []
           else
              if proper_prefix(0, orgl, code) then
                  if count = 1 then current
                  else
                     backtrack(str, s + len, len, count - 1, current)
              else
                 backtrack(str, s, len + 1, count, code)
        end
 in
    backtrack(encode, 0, 1, part, [])
 end;
