# House


enum Access{
     OPEN , CLOSE
}

public class House {

    private String name;
    private String addres;

    public House(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    static class Floors {
        private Access access = Access.CLOSE;

        static class FirstFloor {
            private int rooms = 2;
            private int doors = rooms;
            private int windows = rooms;

            static class MainDoorFirstFloor {
                Access MainDoorFirstFloor = Access.CLOSE;

                public void accessMainDoorFirstFloor(Access access) {
                    if (access == MainDoorFirstFloor) {
                        if (access == Access.CLOSE) {
                            System.out.println("MainDoorFirstFloor already closed!");
                        } else {
                            System.out.println("MainDoorFirstFloor already opened!");
                        }
                    } else {
                        if (access == Access.OPEN) {
                            MainDoorFirstFloor = access;
                            System.out.println("MainDoorFirstFloor opening completed!");
                        } else {
                            MainDoorFirstFloor = access;
                            System.out.println("MainDoorFirstFloor closing completed!");
                        }
                    }
                }

                MainDoorFirstFloor(Access MainDoorFirstFloor) {
                    this.MainDoorFirstFloor = MainDoorFirstFloor;
                }
            }

            static class OneRoomFirstFloor {
                static class DoorOneRoomFirstFloor {
                    Access DoorOneRoomFirstFloor = Access.CLOSE;

                    public void accessDoorOneRoomFirstFloor(Access access) {
                        if (access == DoorOneRoomFirstFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("DoorOneRoomFirstFloor already closed!");
                            } else {
                                System.out.println("DoorOneRoomFirstFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                DoorOneRoomFirstFloor = access;
                                System.out.println("DoorOneRoomFirstFloor opening completed!");
                            } else {
                                DoorOneRoomFirstFloor = access;
                                System.out.println("DoorOneRoomFirstFloor closing completed!");
                            }
                        }
                    }

                    DoorOneRoomFirstFloor(Access DoorOneRoomFirstFloor) {
                        this.DoorOneRoomFirstFloor = DoorOneRoomFirstFloor;
                    }
                }

                static class WindowOneRoomFirstFloor {
                    Access WindowOneRoomFirstFloor = Access.CLOSE;

                    public void accessWindowOneRoomFirstFloor(Access access) {
                        if (access == WindowOneRoomFirstFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("WindowOneRoomFirstFloor already closed!");
                            } else {
                                System.out.println("WindowOneRoomFirstFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                WindowOneRoomFirstFloor = access;
                                System.out.println("WindowOneRoomFirstFloor opening completed!");
                            } else {
                                WindowOneRoomFirstFloor = access;
                                System.out.println("WindowOneRoomFirstFloor closing completed!");
                            }
                        }
                    }

                    WindowOneRoomFirstFloor(Access WindowOneRoomFirstFloor) {
                        this.WindowOneRoomFirstFloor = WindowOneRoomFirstFloor;
                    }

                }
            }


            class TwoRoomFirstFloor {

                static class DoorTwoRoomFirstFloor {
                    Access DoorTwoRoomFirstFloor = Access.CLOSE;

                    public void accessDoorTwoRoomFirstFloor(Access access) {
                        if (access == DoorTwoRoomFirstFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("DoorTwoRoomFirstFloor already closed!");
                            } else {
                                System.out.println("DoorTwoRoomFirstFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                DoorTwoRoomFirstFloor = access;
                                System.out.println("OneDoorTwoRoomFirstFloor opening completed!");
                            } else {
                                DoorTwoRoomFirstFloor = access;
                                System.out.println("DoorTwoRoomFirstFloor closing completed!");
                            }
                        }
                    }

                    DoorTwoRoomFirstFloor(Access DoorTwoRoomFirstFloor) {
                        this.DoorTwoRoomFirstFloor = DoorTwoRoomFirstFloor;
                    }
                }

                static class WindowTwoRoomFirstFloor {
                    Access WindowTwoRoomFirstFloor = Access.CLOSE;

                    public void accessWindowTwoRoomFirstFloor(Access access) {
                        if (access == WindowTwoRoomFirstFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("WindowTwoRoomFirstFloor already closed!");
                            } else {
                                System.out.println("WindowTwoRoomFirstFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                WindowTwoRoomFirstFloor = access;
                                System.out.println("WindowTwoRoomFirstFloor opening completed!");
                            } else {
                                WindowTwoRoomFirstFloor = access;
                                System.out.println("WindowTwoRoomFirstFloor closing completed!");
                            }
                        }
                    }

                    WindowTwoRoomFirstFloor(Access WindowTwoRoomFirstFloor) {
                        this.WindowTwoRoomFirstFloor = WindowTwoRoomFirstFloor;
                    }

                }
            }
        }


        // (@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9(@9(@9@(9

        static class SecondFloor {
            private int rooms = 2;
            private int doors = rooms;
            private int windows = rooms;

            static class RoofSecondFloor {
                Access RoofSecondFloor = Access.CLOSE;

                public void accessRoofSecondFloor(Access access) {
                    if (access == RoofSecondFloor) {
                        if (access == Access.CLOSE) {
                            System.out.println("RoofSecondFloor already closed!");
                        } else {
                            System.out.println("RoofSecondFloor already opened!");
                        }
                    } else {
                        if (access == Access.OPEN) {
                            RoofSecondFloor = access;
                            System.out.println("RoofSecondFloor opening completed!");
                        } else {
                            RoofSecondFloor = access;
                            System.out.println("RoofSecondFloor closing completed!");
                        }
                    }
                }

                RoofSecondFloor(Access RoofSecondFloor) {
                    this.RoofSecondFloor = RoofSecondFloor;
                }
            }

            static class OneRoomSecondFloor {
                static class DoorOneRoomSecondFloor {
                    Access DoorOneRoomSecondFloor = Access.CLOSE;

                    public void accessDoorOneRoomSecondFloor(Access access) {
                        if (access == DoorOneRoomSecondFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("DoorOneRoomSecondFloor already closed!");
                            } else {
                                System.out.println("DoorOneRoomSecondFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                DoorOneRoomSecondFloor = access;
                                System.out.println("DoorOneRoomSecondFloor opening completed!");
                            } else {
                                DoorOneRoomSecondFloor = access;
                                System.out.println("DoorOneRoomSecondFloor closing completed!");
                            }
                        }
                    }

                    DoorOneRoomSecondFloor(Access DoorOneRoomSecondFloor) {
                        this.DoorOneRoomSecondFloor = DoorOneRoomSecondFloor;
                    }
                }

                static class WindowOneRoomSecondFloor {
                    Access WindowOneRoomSecondFloor = Access.CLOSE;

                    public void accessWindowOneRoomSecondFloor(Access access) {
                        if (access == WindowOneRoomSecondFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("WindowOneRoomSecondFloor already closed!");
                            } else {
                                System.out.println("WindowOneRoomSecondFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                WindowOneRoomSecondFloor = access;
                                System.out.println("WindowOneRoomSecondFloor opening completed!");
                            } else {
                                WindowOneRoomSecondFloor = access;
                                System.out.println("WindowOneRoomSecondFloor closing completed!");
                            }
                        }
                    }

                    WindowOneRoomSecondFloor(Access WindowOneRoomSecondFloor) {
                        this.WindowOneRoomSecondFloor = WindowOneRoomSecondFloor;
                    }

                }
            }


            class TwoRoomSecondFloor {

                static class DoorTwoRoomSecondFloor {
                    Access DoorTwoRoomSecondFloor = Access.CLOSE;

                    public void accessDoorTwoRoomSecondFloor(Access access) {
                        if (access == DoorTwoRoomSecondFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("DoorTwoRoomSecondFloor already closed!");
                            } else {
                                System.out.println("DoorTwoRoomSecondFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                DoorTwoRoomSecondFloor = access;
                                System.out.println("DoorTwoRoomSecondFloor opening completed!");
                            } else {
                                DoorTwoRoomSecondFloor = access;
                                System.out.println("DoorTwoRoomSecondFloor closing completed!");
                            }
                        }
                    }

                    DoorTwoRoomSecondFloor(Access DoorTwoRoomSecondFloor) {
                        this.DoorTwoRoomSecondFloor = DoorTwoRoomSecondFloor;
                    }
                }

                static class WindowTwoRoomSecondFloor {
                    Access WindowTwoRoomSecondFloor = Access.CLOSE;

                    public void accessWindowTwoRoomSecondFloor(Access access) {
                        if (access == WindowTwoRoomSecondFloor) {
                            if (access == Access.CLOSE) {
                                System.out.println("WindowTwoRoomSecondFloor already closed!");
                            } else {
                                System.out.println("WindowTwoRoomSecondFloor already opened!");
                            }
                        } else {
                            if (access == Access.OPEN) {
                                WindowTwoRoomSecondFloor = access;
                                System.out.println("WindowTwoRoomSecondFloor opening completed!");
                            } else {
                                WindowTwoRoomSecondFloor = access;
                                System.out.println("WindowTwoRoomSecondFloor closing completed!");
                            }
                        }
                    }

                    WindowTwoRoomSecondFloor(Access WindowTwoRoomSecondFloor) {
                        this.WindowTwoRoomSecondFloor = WindowTwoRoomSecondFloor;
                    }

                }
            }
        }
    }



    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }


}


    class Test {
        public static void main(String[] args) {
            House house = new House("Villa","Uill Street,25 A");

            House.Floors.FirstFloor.MainDoorFirstFloor MainDoorFirstFloor = new House.Floors.FirstFloor.MainDoorFirstFloor(Access.OPEN);
            House.Floors.FirstFloor.OneRoomFirstFloor.DoorOneRoomFirstFloor DoorOneRoomFirstFloor = new House.Floors.FirstFloor.OneRoomFirstFloor.DoorOneRoomFirstFloor(Access.OPEN);
            House.Floors.FirstFloor.OneRoomFirstFloor.WindowOneRoomFirstFloor WindowOneRoomFirstFloor= new House.Floors.FirstFloor.OneRoomFirstFloor.WindowOneRoomFirstFloor (Access.CLOSE);
            House.Floors.FirstFloor.TwoRoomFirstFloor.DoorTwoRoomFirstFloor DoorTwoRoomFirstFloor = new House.Floors.FirstFloor.TwoRoomFirstFloor.DoorTwoRoomFirstFloor(Access.CLOSE);
            House.Floors.FirstFloor.TwoRoomFirstFloor.WindowTwoRoomFirstFloor WindowTwoRoomFirstFloor= new House.Floors.FirstFloor.TwoRoomFirstFloor.WindowTwoRoomFirstFloor (Access.OPEN);

            House.Floors.SecondFloor.RoofSecondFloor RoofSecondFloor = new House.Floors.SecondFloor.RoofSecondFloor(Access.CLOSE);
            House.Floors.SecondFloor.OneRoomSecondFloor.DoorOneRoomSecondFloor DoorOneRoomSecondFloor = new House.Floors.SecondFloor.OneRoomSecondFloor.DoorOneRoomSecondFloor(Access.CLOSE);
            House.Floors.SecondFloor.OneRoomSecondFloor.WindowOneRoomSecondFloor WindowOneRoomSecondFloor= new House.Floors.SecondFloor.OneRoomSecondFloor.WindowOneRoomSecondFloor (Access.OPEN);
            House.Floors.SecondFloor.TwoRoomSecondFloor.DoorTwoRoomSecondFloor DoorTwoRoomSecondFloor = new House.Floors.SecondFloor.TwoRoomSecondFloor.DoorTwoRoomSecondFloor(Access.OPEN);
            House.Floors.SecondFloor.TwoRoomSecondFloor.WindowTwoRoomSecondFloor WindowTwoRoomSecondFloor= new House.Floors.SecondFloor.TwoRoomSecondFloor.WindowTwoRoomSecondFloor (Access.CLOSE);

            //(&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())

/*            MainDoorFirstFloor.accessMainDoorFirstFloor(Access.OPEN);
            DoorOneRoomFirstFloor.accessDoorOneRoomFirstFloor(Access.OPEN);
            WindowOneRoomFirstFloor.accessWindowOneRoomFirstFloor(Access.OPEN);
            DoorTwoRoomFirstFloor.accessDoorTwoRoomFirstFloor(Access.OPEN);
            WindowTwoRoomFirstFloor.accessWindowTwoRoomFirstFloor(Access.OPEN);

            RoofSecondFloor.accessRoofSecondFloor(Access.OPEN);
            DoorOneRoomSecondFloor.accessDoorOneRoomSecondFloor(Access.OPEN);
            WindowOneRoomSecondFloor.accessWindowOneRoomSecondFloor(Access.OPEN);
            DoorTwoRoomSecondFloor.accessDoorTwoRoomSecondFloor(Access.OPEN);
            WindowTwoRoomSecondFloor.accessWindowTwoRoomSecondFloor(Access.OPEN);*/

            //(&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())((&&*******())

            MainDoorFirstFloor.accessMainDoorFirstFloor(Access.CLOSE);
            DoorOneRoomFirstFloor.accessDoorOneRoomFirstFloor(Access.CLOSE);
            WindowOneRoomFirstFloor.accessWindowOneRoomFirstFloor(Access.CLOSE);
            DoorTwoRoomFirstFloor.accessDoorTwoRoomFirstFloor(Access.CLOSE);
            WindowTwoRoomFirstFloor.accessWindowTwoRoomFirstFloor(Access.CLOSE);

            RoofSecondFloor.accessRoofSecondFloor(Access.CLOSE);
            DoorOneRoomSecondFloor.accessDoorOneRoomSecondFloor(Access.CLOSE);
            WindowOneRoomSecondFloor.accessWindowOneRoomSecondFloor(Access.CLOSE);
            DoorTwoRoomSecondFloor.accessDoorTwoRoomSecondFloor(Access.CLOSE);
            WindowTwoRoomSecondFloor.accessWindowTwoRoomSecondFloor(Access.CLOSE);

        }
    }
