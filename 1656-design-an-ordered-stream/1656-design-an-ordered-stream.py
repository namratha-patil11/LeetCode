class OrderedStream:

    def __init__(self, n: int):
        self.ptr = 1
        self.hashmap = dict()
        

    def insert(self, idKey: int, value: str) -> List[str]:
        self.hashmap[idKey] = value
        output = []
        if idKey > self.ptr:
            return output
        
        while idKey in self.hashmap:
            output.append(self.hashmap[idKey])
            idKey += 1
            self.ptr = idKey
            
        return output
        


# Your OrderedStream object will be instantiated and called as such:
# obj = OrderedStream(n)
# param_1 = obj.insert(idKey,value)