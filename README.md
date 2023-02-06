# SOLID
@startuml


abstract Resource
Resource <.. ResourceAllocator
ResourceAllocator : public int allocate(Resource res)
ResourceAllocator : public void free(Resource res)

Resource :    public abstract int allocate();

Resource :    public abstract void free();

Resource :    public abstract void markSlotFree(int resourceId);

Resource :   public abstract void markSlotBusy(int resourceId);

Resource :    public abstract int findFreeSlot();
class SpaceSlot
class TimeSlot
SpaceSlot --|> Resource
TimeSlot --|> Resource
@enduml