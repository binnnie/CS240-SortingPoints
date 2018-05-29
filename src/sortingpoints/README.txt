1. The runtime for insertion and selection is O(n^2) since they have to run through the array to fi-
   nd the next value n times, n * n = n^2. The runtime for heap sort is O(nlog(n)) since removing f-
   rom a heap is log(n) and you have to do that n times to get a sorted array. The runtime for merge
   sort is also O(nlog(n)) because you divide it in half recursively making log(n) parts and you ha-
   to merge those parts which takes n time.
2. 5, 7, 9, 1, 3, 4, 6, 8, 2
   Pivot: 3
   1, 2 - 3 - (9, 5, 4, 6, 8, 7)
   Pivot: 7
   6, 5, 4 - 7 - 8, 9
   Merge Up:
   4, 5, 6, 7, 8, 9
   1, 2, 3, 4, 5, 6, 7, 8, 9
3. Bucket "a": da, ca
      Bucket "c": ca
      Bucket "d": da
   Bucket "b": b
   Bucket "c": abc
   Bucket "d": defcd, abebd
      Bucket "b": abebd
         Bucket "e": abebd
            Bucket "b": abebd
               Bucket "a": abebd
      Bucket "c": defcd
         Bucket "f": defcd
            Bucket "e": defcd
               Bucket "d": defcd
   Bucket "e": dfe
   Bucket "f": ffff, fef