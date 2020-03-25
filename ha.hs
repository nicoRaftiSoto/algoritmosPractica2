evalDC :: Eq a=>(a->Bool) -> (a->b) -> (a->[a]) -> ([b]->b) -> a -> b
evalDC isBase base split join x   | isBase x = base x
                                  | otherwise = join (map (evalDC isBase base split join) (split x))

mayoryMenor :: [Int] -> (Int, Int) -> (Int, Int)
mayoryMenor [] (x,y) = (x,y)
mayoryMenor (x:xs) (y,z) = if (x<y && x<z) then mayoryMenor xs (x,z) else if (x>y && x>z) then mayoryMenor xs (y,x) else mayoryMenor xs (y,z)

mayorIndice :: [Int] -> Int -> Int -> Int -> Int
mayorIndice [] y n m = y
mayorIndice [x] y n m = if (x>=n) then m else y
mayorIndice (x:xs) y n m = if (x>=n) then mayorIndice xs m x (m+1) else mayorIndice xs y n (m+1)

mifb :: [Int] -> Int -> Int
mifb [] x = x
mifb (x:xs) n = if (mayor x (x:xs)) then n else mifb xs (n+1)

mayor :: Int -> [Int] -> Bool
mayor x [] = False
mayor n [x] = n>=x
mayor n (x:xs) = n>=x && mayor n xs
