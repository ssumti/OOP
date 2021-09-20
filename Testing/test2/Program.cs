using System;
using System.Threading.Tasks;
using Microsoft.AspNetCore.SignalR.Client;

namespace test
{
    class Program
    {
        bool isConnected = false;
        public static async Task Main(string[] args)
        {
            HubConnection hub;
            hub = new HubConnectionBuilder().WithUrl("https://localhost:44306/hubs/game").Build();
            await hub.StartAsync();
            await hub.SendAsync("AddToGroup", "Room1", "zzumti");
            hub.Closed += async (error) =>
            {
                Random random = new Random();
                await Task.Delay(random.Next(0, 5) * 1000);
                await hub.StartAsync();
                await hub.SendAsync("AddToGroup", "Room1", "zzumti");
                Console.WriteLine("Connected...");
            };
            hub.On<string>("EnteredOrLeft", (message) =>
            {
                Console.WriteLine(message);
            });
            hub.On<string, string>("ReceiveMessage", (user, message) =>
            {
                Console.WriteLine(user + ": " + message);
            });
            string key = "a";
            while (key != "")
            {
                key = Console.ReadLine();
                // switch (key)
                // {
                //     case '1':
                //         await hub.InvokeAsync("SendMessageGroup", "Room1", "zzumti", "HiThere");
                //         break;
                //     default:
                //         key = '0';
                //         break;
                // }
                await hub.InvokeAsync("SendMessageGroup", "Room1", "zzumti", key);
            }
            await hub.SendAsync("RemoveFromGroup", "Room1", "zzumti");
        }
    }

}
