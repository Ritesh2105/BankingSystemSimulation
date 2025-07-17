## 🏦 BankingSystemSimulation

A multithreaded Java simulation that models fund transfers between two bank accounts using `ExecutorService`. The system ensures thread safety and prevents race conditions using synchronized methods.

---

### 📂 Project Structure

BankingSystemSimulation/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── ritesh/
                    └── banking/
                        ├── Account.java
                        ├── UserTransaction.java
                        └── Main.java
```

---

### ⚙️ Technologies Used

* Java 17+ (or any compatible version)
* Maven (build & dependency management)
* IntelliJ IDEA (recommended IDE)
* Java `ExecutorService` for multithreading

---

### 🚀 How It Works

* Two accounts: **Ritesh** (rich 💰) and **Amit** (not so much 😅)
* A thread pool executes randomized transfer tasks between them.
* Transfers are thread-safe using `synchronized` methods.
* Balance checks ensure transfers don’t proceed if funds are insufficient.

---

### ✅ Features

* 🔄 Concurrent money transfers using multiple threads
* 💸 Synchronized deposit, withdraw, and transfer logic
* 🚫 Prevents overdrawing with balance checks
* 🧠 Demonstrates basic concurrency and thread-safe operations in Java

---

### ▶️ Run the Simulation

#### Step 1: Clone or download the repo

```bash
git clone https://github.com/your-username/BankingSystemSimulation.git
```

#### Step 2: Open in IntelliJ (or any IDE)

* Make sure the entire project folder is opened (not just `/src`)
* Let Maven finish indexing

#### Step 3: Run `Main.java`

You should see output like:

```
pool-1-thread-2 withdrew $2000 from Ritesh. New Balance is $9998000
pool-1-thread-2 deposited $2000 to Amit. New Balance is $3000
pool-1-thread-2 transferred $2000 → from Ritesh to Amit
```

---

### 📌 Sample Output

```
pool-1-thread-3 not enough balance in Amit. Balance is $1000
pool-1-thread-1 transferred $2000 → from Ritesh to Amit
pool-1-thread-4 transferred $2000 → from Amit to Ritesh
```

---

### 💡 Possible Enhancements

* Add more accounts (dynamic)
* Log transactions to a file
* Add transaction timestamps or IDs
* Simulate deadlocks and how to prevent them
* Swing/JavaFX UI for live visualization

---

### 👨‍💻 Author

**Ritesh**
Backend Developer

---

### 📜 License

MIT License – feel free to use and modify!

---
